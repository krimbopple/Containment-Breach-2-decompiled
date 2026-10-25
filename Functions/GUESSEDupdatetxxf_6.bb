Function GUESSEDupdatetxxf_6%(arg0$)
    If (((GUESSEDupdatexdb() = $00) Lor GUESSEDupdateanimatenpc()) <> 0) Then
        Return $00
    EndIf
    blitz_TXXF80Z0FD00($10)
    blitz_TXXF80Z0FD00(GUESSEDupdatedropitem())
    blitz_ZXBBD60DX0(arg0)
    GUESSEDcallgetsend($02, $01, $00)
    Return $00
End Function
