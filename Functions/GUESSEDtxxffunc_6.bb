Function GUESSEDtxxffunc_6%(arg0$)
    If (((GUESSEDupdatexdb() = $00) Lor GUESSEDupdateanimatenpc()) <> 0) Then
        Return $00
    EndIf
    blitz_TXXF80Z0FD00($13)
    blitz_TXXF80Z0FD00(GUESSEDupdatedropitem())
    blitz_ZXBBD60DX0(arg0)
    GUESSEDcallgetsend($03, $01, $02)
    Return $00
End Function
