Function MP_ProcessMessages%()
    While (MP_MessageAvailable() <> 0)
        If (GUESSEDsetfd() <> 0) Then
            Exit
        EndIf
    Wend
    Return $00
End Function
