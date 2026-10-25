Function GUESSEDcreateitem.items(arg0%, arg1#, arg2#, arg3#, arg4%, arg5%, arg6%, arg7#, arg8%)
    Local local0%
    Local local1.items
    Local local2.itemtemplates
    Local local3%
    catcherrors((((((((((((((((((("CreateItem.Items(, " + (Str local0)) + ", ") + (Str arg1)) + ", ") + (Str arg2)) + ", ") + (Str arg3)) + ", ") + (Str arg4)) + ", ") + (Str arg5)) + ", ") + (Str arg6)) + ", ") + (Str arg7)) + ", ") + (Str arg8)) + ")"))
    local2 = GUESSEDcreateitem_2("", $00, arg0)
    If (local2 = Null) Then
        GUESSEDsetred((("Unable to create " + (Str arg0)) + " item."))
        local2 = GUESSEDcreateitem_2("ERROR", $270F, $FFFFFFFF)
        If (local2 = Null) Then
            runtimeerrorex(format(format(getlocalstring("runerr", "item"), (Str arg0), "{0}"), (Str arg0), "{1}"))
        EndIf
    EndIf
    local1 = (New items)
    local1\Field6 = local2
    GUESSEDscaleentity(local1, "", arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8)
    catcherrors((((((((((((((((((((("Uncaught: CreateItem.Items(" + (Str local3)) + ", ") + (Str local0)) + ", ") + (Str arg1)) + ", ") + (Str arg2)) + ", ") + (Str arg3)) + ", ") + (Str arg4)) + ", ") + (Str arg5)) + ", ") + (Str arg6)) + ", ") + (Str arg7)) + ", ") + (Str arg8)) + ")"))
    Return local1
    Return Null
End Function
