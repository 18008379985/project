
function doSearchByType(val,id){

    $('#dd1').find("a").css("color","#888");

    $(id).css("color","#FE984F");

    $.post('/service/findProjectByType',{projectType:val},function(data) {

        if (data) {$('#DataGrid').datagrid('loadData', data);} else{showMessage("没有查询到数据！");}

    },'json');
}

function doSearchBySchedule(val,id){

    $('#dd2').find("a").css("color","#888");

    $(id).css("color","#FE984F");

    $.post('/service/findProjectByType',{projectType:val},function(data) {

        if (data) {$('#DataGrid').datagrid('loadData', data);} else{showMessage("没有查询到数据！");}

    },'json');
}

function doSearchByName(val){

    $.post('/service/findProject',{projectName:val},function(data) {

        if (data) {$('#DataGrid').datagrid('loadData', data);} else{showMessage("没有查询到数据！");}

    },'json');
}

function showMessage(info){
    $.messager.show({
        title:'提示信息',
        msg:info,
        timeout:5000,
        showType:'slide'
    });
}



    function clearForm(){ $('#editForm').form('clear');}


function doSave() {

    $('#editForm').form('submit', {

        url : 'SetData.jsp',

        onSubmit : function() {

            return $(this).form('enableValidation').form('validate');

        },

        success : function(data) {

            if(data=="true"){

                $.messager.alert("操作提示", "操作成功！","info");

                $('#DataGrid').datagrid('reload');

            }else{

                $.messager.alert("操作提示", "操作失败！","error");
            }
        }
    });
}



function doRemove()

{
    var sys_id = "";

    var row = $('#DataGrid').datagrid('getSelections');

    for(var i=0; i<row.length; i++)
    {
        sys_id += row[i].PROCESS_ID +",";
    }

    sys_id = sys_id.substr(0,sys_id.length-1); //去掉字符串最后面的逗号；

    if (row.length>0)
    {
        $.messager.confirm('操作提示','确定要删除所选择的记录吗?',function(r){

            if (r){

                $.post('RemoveData.jsp',{PROCESS_ID:sys_id},function(result){


                    if (result)
                    {
                        $('#DataGrid').datagrid('reload');    // reload the user data
                    } else
                    {
                        $.messager.alert("操作提示", "删除失败!","info");
                    }

                },'json');

            } // END IF (r)

        });  // END  $.messager.confirm

    } // END  if (row.length>0)

} // END function doRemove


//表格选择行记录赋值给表单
function getSelected()
{
    var row = $('#DataGrid').datagrid('getSelected');

    if (row){ $('#editForm').form('load', row)}
}

