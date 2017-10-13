$(function () {
    $("#jqGrid").jqGrid({
        url: baseURL + 'generator/goods/list',
        datatype: "json",
        colModel: [			
			{ label: 'goodsId', name: 'goodsId', index: 'goods_id', width: 50, key: true },
			{ label: '文件名称', name: 'name', index: 'name', width: 80 }, 			
			{ label: '文件介绍', name: 'intro', index: 'intro', width: 80 }, 			
			//{ label: '状态  0:异常  1：正常', name: 'status', index: 'status', width: 80 },
            { label: '状态 0:异常  1：正常', name: 'status', width: 80, formatter: function(value, options, row){
                return value === 0 ?
                    '<span class="label label-success">正常</span>' :
                    '<span class="label label-danger">异常</span>';
            }},
			{ label: '创建者', name: 'createUserId', index: 'create_user_id', width: 80 }, 			
			{ label: '创建时间', name: 'createTime', index: 'create_time', width: 80 }			
        ],
		viewrecords: true,
        height: 385,
        rowNum: 10,
		rowList : [10,30,50],
        rownumbers: true, 
        rownumWidth: 25, 
        autowidth:true,
        multiselect: true,
        pager: "#jqGridPager",
        jsonReader : {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames : {
            page:"page", 
            rows:"limit", 
            order: "order"
        },
        gridComplete:function(){
        	//隐藏grid底部滚动条
        	$("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" }); 
        }
    });
});

//设置定时任务3秒刷新一次页面上jqGrid的数据
setInterval(function(){
        $("#jqGrid").trigger("reloadGrid");
    }
    ,3000);

var vm = new Vue({
	el:'#rrapp',
	data:{
		showList: true,
		title: null,
		goods: {}
	},

	methods: {
        query: function () {
            vm.reload();
            alert(test2)
        },
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.goods = {};
		},
		update: function (event) {
			var goodsId = getSelectedRow();
			if(goodsId == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
            
            vm.getInfo(goodsId)
		},
		saveOrUpdate: function (event) {
			var url = vm.goods.goodsId == null ? "generator/goods/save" : "generator/goods/update";
			$.ajax({
				type: "POST",
			    url: baseURL + url,
                contentType: "application/json",
			    data: JSON.stringify(vm.goods),
			    success: function(r){
			    	if(r.code === 0){
						alert('操作成功', function(index){
							vm.reload();
						});
					}else{
						alert(r.msg);
					}
				}
			});
		},
		del: function (event) {
			var goodsIds = getSelectedRows();
			if(goodsIds == null){
				return ;
			}
			
			confirm('确定要删除选中的记录？', function(){
				$.ajax({
					type: "POST",
				    url: baseURL + "generator/goods/delete",
                    contentType: "application/json",
				    data: JSON.stringify(goodsIds),
				    success: function(r){
						if(r.code == 0){
							alert('操作成功', function(index){
								$("#jqGrid").trigger("reloadGrid");
							});
						}else{
							alert(r.msg);
						}
					}
				});
			});
		},
		getInfo: function(goodsId){
			$.get(baseURL + "generator/goods/info/"+goodsId, function(r){
                vm.goods = r.goods;
            });
		},
		reload: function (event) {
			vm.showList = true;
			alert(test2)
			var page = $("#jqGrid").jqGrid('getGridParam','page');
			$("#jqGrid").jqGrid('setGridParam',{ 
                page:page
            }).trigger("reloadGrid");
		}
	}
});