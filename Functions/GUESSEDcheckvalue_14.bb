Function GUESSEDcheckvalue_14%(arg0%, arg1%, arg2%, arg3%)
    If (GUESSEDgetmap_2(arg0, arg1, arg2) <> arg3) Then
        GUESSEDsetmap_5(arg0, arg1, arg2, arg3)
        Return $01
    EndIf
    Return $00
    Return $00
End Function
