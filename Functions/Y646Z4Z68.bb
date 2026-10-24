Function Y646Z4Z68%(arg0.events, arg1%)
    Local local0%
    If (arg1 <> $FFFFFFFF) Then
        If (arg0\Field25 > $00) Then
            X4X08826F2[arg0\Field25] = Null
        EndIf
        X4X08826F2[arg1] = arg0
        arg0\Field25 = arg1
    Else
        For local0 = $01 To $FF Step $01
            If (X4X08826F2[local0] = Null) Then
                X4X08826F2[local0] = arg0
                arg0\Field25 = local0
                Exit
            EndIf
        Next
    EndIf
    Select arg0\Field32
        Case $4C,$13,$3A,$10,$11,$36,$41,$49,$4A,$0B,$46,$1B,$40,$14,$01,$48,$4B,$0E,$26,$42,$44
            F86ZBF086(arg0, $01)
        Default
            F86ZBF086(arg0, $00)
    End Select
    TF442D8X6D = $00
    YXX8D0BX48 = $00
    Return $00
End Function
