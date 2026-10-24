Function update268%()
    Local local0#
    If (i_268\Field2 > $01) Then
        local0 = ((fps\Field3[$00] / ((Float (i_268\Field2 = $03)) + 1.0)) * ((((Float i_714\Field0) * 0.5) + 1.0) + (Float (T8660BZ460\Field3 = $04))))
        i_268\Field1 = max((i_268\Field1 - local0), 0.0)
        i_268\Field3 = (0.0 < i_268\Field1)
        i_268\Field0 = 140.0
        If (((1.0 <= i_268\Field1) And (1.0 > (i_268\Field1 - local0))) <> 0) Then
            playsound_strict(loadtempsound("SFX\SCP\268\InvisibilityOff.ogg"), $00, $00)
        EndIf
    Else
        If (0.0 >= i_268\Field0) Then
            i_268\Field1 = min((i_268\Field1 + fps\Field3[$00]), 700.0)
        Else
            i_268\Field0 = (i_268\Field0 - fps\Field3[$00])
        EndIf
        i_268\Field3 = $00
    EndIf
    Return $00
End Function
