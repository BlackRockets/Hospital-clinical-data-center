(function($){
	$.fn.initList = function(){
		var selectTitle = $(this);
		/*selectTitle.draggable({handle:'.list-title'}); */// 添加拖拽事件

		/**
		 * 单击列表单击: 改变样式
		 */
		var itemClickHandler = function(){
			$(this).parent('.item-box').find('.item').removeClass('selected-item');
			$(this).addClass('selected-item');
		}

		/**
		 * 左边列表项移至右边
		 */
		var leftMoveRight = function(){
			selectTitle.find('.list-body .right-box').append($(this).removeClass('selected-item'));
			initItemEvent();
		}

		/**
		 * 右边列表项移至左边
		 */
		var rightMoveLeft = function(){
			selectTitle.find('.list-body .left-box').append($(this).removeClass('selected-item'));
			initItemEvent();
		}

		/**
		 * 初始化列表项选择事件
		 */
		function initItemEvent(){
			// 左边列表项单击、双击事件
			selectTitle.find('.list-body .left-box').find('.item').unbind('click');
			selectTitle.find('.list-body .left-box').find('.item').unbind('dblclick');
			selectTitle.find('.list-body .left-box').find('.item').each(function(){
				$(this).on("click", itemClickHandler);
				$(this).on('dblclick', leftMoveRight);
			});

			// 右边列表项单击、双击事件
			selectTitle.find('.list-body .right-box').find('.item').unbind('click');
			selectTitle.find('.list-body .right-box').find('.item').unbind('dblclick');
			selectTitle.find('.list-body .right-box').find('.item').each(function(){
				$(this).on('click', itemClickHandler);
				$(this).on('dblclick', rightMoveLeft);
			});
		}

		/**
		 * 获取选择的值
		 * @return json数组
		 */
		function getSelectedValue(){

			var leftBox = selectTitle.find('.list-body .left-box');
			//角色id
			var roleId = "";
			leftBox.find('#id').each(function(){
				roleId=$(this).text();
			});
			var teamDataId="";
			leftBox.find('#teamDataId').each(function(){
				teamDataId=$(this).text();
			});

			//用户数据
			var rightBox = selectTitle.find('.list-body .right-box');
			var names = new Array();
			rightBox.find('.item').each(function(){
				departmentId = $("#departmentId").val();
				/*itemValue = {};
				itemValue[$(this).attr('data-id')] = $(this).text();*/
				names.push($(this).text());
				names.join(",")
			});
			var nameData = names.toString();

			//权限数据
			var checked=[];
			$('#t2 input[name="menu"]:checked').each(function(){
				checked.push($(this).val());
			});
			var permissionName = checked.toString();

			$.ajax({
				url: '/user/addTeamInUserOrPer/',
				method: 'post',
				data:{
					names:nameData,
					permissionName:permissionName,
					roleId:roleId,
					groupId:id,
					teamDataId:teamDataId,
				},
				async:false,
				success: function (result) {
						alert("操作成功");
						history.go(0)
				}
			})
		}

		/**
		 * 初始化添加、移除、获取值按钮事件
		 */
		function initBtnEvent(){
			var btnBox = selectTitle.find('.list-body .center-box');
			var leftBox = selectTitle.find('.list-body .left-box');
			var rightBox = selectTitle.find('.list-body .right-box');

			// 添加一项
			btnBox.find('.add-one').on('click', function(){
				leftBox.find('.selected-item').trigger('dblclick'); // 触发双击事件
			});
			// 添加所有项
			btnBox.find('.add-all').on('click', function(){
				leftBox.find('.item').trigger('dblclick');
			});
			// 移除一项
			btnBox.find('.remove-one').on('click', function(){
				rightBox.find('.selected-item').trigger('dblclick'); // 触发双击事件
			});
			// 移除所有项
			btnBox.find('.remove-all').on('click', function(){
				rightBox.find('.item').trigger('dblclick');
			});

			selectTitle.find('.list-footer').find('.btn').on('click',getSelectedValue);
		}

		initItemEvent();
		initBtnEvent();
	}
})($)