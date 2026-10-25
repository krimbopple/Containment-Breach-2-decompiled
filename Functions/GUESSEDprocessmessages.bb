Function GUESSEDprocessmessages%()
    While (MP_MessageAvailable() <> 0)
        GUESSEDsettx_2()
    Wend
    Return $00
End Function
