Function GUESSEDcreatescreen%(arg0$)
    If (instr(arg0, "chatscreen", $01) <> $00) Then
        Return $00
    EndIf
    Select arg0
        Case "screen_attention.png"
            Return $01
        Case "screen_009_warning.png"
            Return $02
        Case "screen_error.png"
            Return $03
        Case "screen_logo.png"
            Return $04
        Default
            Return $05
    End Select
    Return $00
End Function
