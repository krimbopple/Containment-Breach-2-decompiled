Function TXXZ04066BX.TXX0ZX4BDF2(arg0%, arg1$, arg2$, arg3%, arg4%)
    If (((CFX4Z8FFD[arg0] <> Null) Lor (arg0 = $00)) <> 0) Then
        Return Null
    EndIf
    CFX4Z8FFD[arg0] = (New TXX0ZX4BDF2)
    CFX4Z8FFD[arg0]\Field5 = arg0
    CFX4Z8FFD[arg0]\Field2 = arg4
    CFX4Z8FFD[arg0]\Field1 = arg3
    XZDDF222BF(arg0, $00, arg1, arg2)
    Return CFX4Z8FFD[arg0]
    Return Null
End Function
