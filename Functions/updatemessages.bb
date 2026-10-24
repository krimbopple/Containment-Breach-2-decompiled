Function updatemessages%()
    If (T208Z6XX884 <> 0) Then
        Return $00
    EndIf
    If (0.0 < msg\Field2) Then
        msg\Field2 = (msg\Field2 - fps\Field3[$00])
    Else
        msg\Field2 = 0.0
        msg\Field0 = ""
    EndIf
    Return $00
End Function
