Function Steam_GetPlayerName$()
    If (XD82FXFXF4 = $00) Then
        Return "Player"
    EndIf
    Return _Steam_GetPlayerName()
    Return ""
End Function
