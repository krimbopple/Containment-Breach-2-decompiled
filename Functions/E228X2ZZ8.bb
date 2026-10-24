Function E228X2ZZ8%(arg0%, arg1$, arg2%, arg3%, arg4%, arg5%, arg6#, arg7#)
    If (arg1 <> "") Then
        If (arg5 <> 0) Then
            If (arg4 >= opt\Field21) Then
                arg2 = (arg2 - (stringwidth(replace(arg1, chr($03), "X")) Sar $01))
            Else
                arg2 = (((arg4 Sar $01) + arg2) - (stringwidth(replace(arg1, chr($03), "X")) Sar $01))
            EndIf
        EndIf
        If (arg0 <> 0) Then
            Return X44ZBBZ44X((Float arg2), (Float arg3), arg1, $00, $00, arg6, $00, arg7)
        EndIf
        textex(arg2, arg3, arg1, $00, $00)
    EndIf
    Return $00
    Return $00
End Function
