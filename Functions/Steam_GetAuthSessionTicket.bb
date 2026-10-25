Function Steam_GetAuthSessionTicket%()
    If (TFDZBBF4FD <> $00) Then
        _Steam_CancelAuthTicket(TFDZBBF4FD)
    EndIf
    TFDZBBF4FD = _Steam_GetAuthSessionTicket(TX82X84B8D6, banksize(TX82X84B8D6), TXX84F20882, "")
    Return TFDZBBF4FD
    Return $00
End Function
