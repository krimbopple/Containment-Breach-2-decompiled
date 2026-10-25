Function GUESSEDtxxffunc_5%()
    If ((GUESSEDupdateanimatenpc() Lor (GUESSEDupdatexdb() = $00)) <> 0) Then
        Return $00
    EndIf
    blitz_TXXF80Z0FD00($0D)
    blitz_TXXF80Z0FD00(GUESSEDupdatedropitem())
    GUESSEDcallgetsend($02, $01, $00)
    Return $00
End Function
