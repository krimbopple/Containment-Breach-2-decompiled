Function GUESSEDprocessmessages_2%()
    While (MP_MessageAvailable() <> 0)
        GUESSEDfdfunc()
    Wend
    Return $00
End Function
