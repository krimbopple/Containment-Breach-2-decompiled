Function GUESSEDpositionentity_9%(arg0.T24B4ZF6F6)
    If (arg0 = Null) Then
        Return $00
    EndIf
    If (TXXF6F02DB2[GUESSEDupdatedropitem()] <> Null) Then
        GUESSEDloadtexture(arg0, TXXF6F02DB2[GUESSEDupdatedropitem()]\Field55\Field16)
    Else
        GUESSEDloadtexture(arg0, $01)
    EndIf
    positionentity(arg0\Field9, 0.0, 0.0, 0.0, $00)
    showentity(arg0\Field9)
    DZ64X028\Field8 = 4.0
    Return $00
End Function
