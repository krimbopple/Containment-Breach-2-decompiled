Function textex%(arg0%, arg1%, arg2$, arg3%, arg4%)
    If (len(arg2) > $01) Then
        batching($01)
        text(arg0, arg1, arg2, arg3, arg4)
        batching($00)
        Return $00
    EndIf
    text(arg0, arg1, arg2, arg3, arg4)
    Return $00
End Function
