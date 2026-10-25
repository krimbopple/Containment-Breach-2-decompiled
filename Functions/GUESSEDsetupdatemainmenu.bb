Function GUESSEDsetupdatemainmenu%(arg0%)
    If (T8X2046020\Field25 <> $00) Then
        Return $02
    EndIf
    If (arg0 = $FFFFFFFF) Then
        T8X2046020\Field25 = MP_CreateStream($00, $01, $3A98)
    Else
        T8X2046020\Field25 = MP_CreateStream(arg0, $01, $3A98)
    EndIf
    If (T8X2046020\Field25 = $00) Then
        Return $00
    EndIf
    GUESSEDcheckvalue_29(GUESSEDupdatexdb())
    If (arg0 <> $00) Then
        GUESSEDscaleresize($1000)
        T8X2046020\Field5 = $01
        GUESSEDcreaterecord($FFFFFFFF, $BB80, $FFFFFC18, $800)
        T8X2046020\Field18 = $01
        T8X2046020\Field17 = $F0
        T8X2046020\Field0 = $00
    Else
        GUESSEDscaleresize($80000)
        T8X2046020\Field5 = $00
    EndIf
    Return $01
    Return $00
End Function
