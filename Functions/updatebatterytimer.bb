Function updatebatterytimer%()
    batmsgtimer = (fps\Field3[$00] + batmsgtimer)
    If (105.0 <= batmsgtimer) Then
        batmsgtimer = 0.0
    EndIf
    Return $00
End Function
