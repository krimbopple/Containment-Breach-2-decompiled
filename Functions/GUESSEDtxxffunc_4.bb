Function GUESSEDtxxffunc_4%(arg0.TX2BF6X0FF4, arg1%)
    If (((GUESSEDupdateanimatenpc() Lor (GUESSEDupdatexdb() = $00)) Lor (arg0 = Null)) <> 0) Then
        Return $00
    EndIf
    blitz_TXXF80Z0FD00($1D)
    blitz_TXXF80Z0FD00(GUESSEDupdatedropitem())
    blitz_TXXF80Z0FD00(arg0\Field13)
    blitz_TXXF80Z0FD00(arg1)
    GUESSEDcallgetsend($02, $01, $00)
    Return $00
End Function
