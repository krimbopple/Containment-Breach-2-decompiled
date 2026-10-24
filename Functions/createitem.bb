Function createitem.items(arg0$, arg1%, arg2#, arg3#, arg4#, arg5%, arg6%, arg7%, arg8#, arg9%)
    Local local0.items
    Local local1%
    catcherrors((((((((((((((((((((("CreateItem.Items(" + arg0) + ", ") + (Str arg1)) + ", ") + (Str arg2)) + ", ") + (Str arg3)) + ", ") + (Str arg4)) + ", ") + (Str arg5)) + ", ") + (Str arg6)) + ", ") + (Str arg7)) + ", ") + (Str arg8)) + ", ") + (Str arg9)) + ")"))
    arg0 = lower(arg0)
    local0 = (New items)
    local0\Field6 = XF44086D60(arg0, arg1, $FFFFFFFF)
    If (local0\Field6 = Null) Then
        runtimeerrorex(format(format(getlocalstring("runerr", "item"), arg0, "{0}"), (Str arg1), "{1}"))
    EndIf
    T2BF62626B(local0, arg0, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)
    catcherrors((((((((((((((((((((("Uncaught: CreateItem.Items(" + arg0) + ", ") + (Str arg1)) + ", ") + (Str arg2)) + ", ") + (Str arg3)) + ", ") + (Str arg4)) + ", ") + (Str arg5)) + ", ") + (Str arg6)) + ", ") + (Str arg7)) + ", ") + (Str arg8)) + ", ") + (Str arg9)) + ")"))
    Return local0
    Return Null
End Function
