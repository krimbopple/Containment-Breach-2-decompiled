Function Steam_Update%()
    If (MP_IsConnected() = $01) Then
        X40BZ0ZDD8\Field0 = (X40BZ0ZDD8\Field0 + MP_GetLoadingProgress())
        If (700.0 < X40BZ0ZDD8\Field0) Then
            GUESSEDinitinitnewgame_7($04, "", $00)
            Return $00
        EndIf
    EndIf
    MP_ProcessMessages()
    _Steam_Update()
    Return $00
End Function
