Function GUESSEDupdatetxxf%()
    If (((GUESSEDupdatexdb() = $00) Lor GUESSEDupdateanimatenpc()) <> 0) Then
        Return $00
    EndIf
    blitz_TXXF80Z0FD00($14)
    blitz_TXXF80Z0FD00(GUESSEDupdatedropitem())
    GUESSEDcallgetsend($00, $00, $00)
    Return $00
End Function
