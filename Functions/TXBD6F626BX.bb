Function TXBD6F626BX%(arg0%)
    If (T8X2046020\Field25 <> $00) Then
        Return $02
    EndIf
    If (arg0 = $FFFFFFFF) Then
        T8X2046020\Field25 = X8828F6D84($00, $01, $3A98)
    Else
        T8X2046020\Field25 = X8828F6D84(arg0, $01, $3A98)
    EndIf
    If (T8X2046020\Field25 = $00) Then
        Return $00
    EndIf
    X2XX40D42B(X4BX024DX0())
    If (arg0 <> $00) Then
        TX2ZZBBZ466($1000)
        T8X2046020\Field5 = $01
        TXZ2FZDXZZX($FFFFFFFF, $BB80, $FFFFFC18, $800)
        T8X2046020\Field18 = $01
        T8X2046020\Field17 = $F0
        T8X2046020\Field0 = $00
    Else
        TX2ZZBBZ466($80000)
        T8X2046020\Field5 = $00
    EndIf
    Return $01
    Return $00
End Function
