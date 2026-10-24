Function updatesavestate%()
    If (selecteddifficulty\Field1 <> $03) Then
        cansave = $03
        If ((((quickloadpercent > $FFFFFFFF) Lor (0.0 > XZ0260X8X2\Field52)) Lor (XZ0260X8X2\Field38 < $02)) <> 0) Then
            cansave = $00
        EndIf
    EndIf
    Return $00
End Function
