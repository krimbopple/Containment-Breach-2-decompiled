Function MP_ReceiveMessage%(arg0%, arg1.T484FFBZX)
    If (_BN_RecvMsg(arg0, arg1\Field3, banksize(arg1\Field3)) <> 0) Then
        arg1\Field2 = _BN_MsgSize(arg0)
        GUESSEDsetfield_15(arg1)
        Return $01
    EndIf
    Return $00
    Return $00
End Function
