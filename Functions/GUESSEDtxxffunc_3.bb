Function GUESSEDtxxffunc_3%(arg0%)
    If (((GUESSEDupdatexdb() = $00) Lor GUESSEDupdateanimatenpc()) <> 0) Then
        Return $00
    EndIf
    blitz_TXXF80Z0FD00($17)
    blitz_TXXF80Z0FD00(GUESSEDupdatedropitem())
    blitz_TXXF80Z0FD00(arg0)
    GUESSEDcallgetsend($00, $01, $00)
    Return $00
End Function
