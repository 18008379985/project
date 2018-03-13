



function doSearch(value){
    // $('#DataGrid').datagrid('load',{PROCESS_NAME: $('#searchStr').val()});
    alert('You input: ' + value);



    $.post('GetData.jsp',{PROCESS_NAME:$('#searchStr').val()},function(result){


        if (result)
        {
            $('#DataGrid').datagrid('loadData',result);

        } else
        {
            $.messager.alert("操作提示", "查询失败!","info");
        }

    },'json');

}

