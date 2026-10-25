Function GUESSEDdrawoval%(arg0%, arg1%, arg2%, arg3%, arg4%)
    If (TXX2B2Z8ZFD[arg4] <> $00) Then
        resizeimage(TXX2B2Z8ZFD[arg4], arg2, arg3)
        eax_0006 = TXX2B2Z8ZFD[arg4]
        drawimage(arg0, arg1, $00, $01)
    Else
        oval(arg0, eax_0006, arg2, arg3, arg4)
    EndIf
    Return $00
End Function
