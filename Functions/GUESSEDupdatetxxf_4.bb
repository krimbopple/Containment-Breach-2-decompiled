Function GUESSEDupdatetxxf_4%(arg0$)
    If (((GUESSEDupdatexdb() = $00) Lor GUESSEDupdateanimatenpc()) <> 0) Then
        Return $00
    EndIf
    blitz_TXXF80Z0FD00($11)
    blitz_TXXF80Z0FD00(GUESSEDupdatedropitem())
    blitz_ZXBBD60DX0(arg0)
    GUESSEDcallgetsend($03, $01, $02)
    Return $00
End Function
