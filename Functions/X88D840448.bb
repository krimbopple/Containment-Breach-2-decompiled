Function X88D840448%(arg0$, arg1$, arg2$, arg3$, arg4%, arg5%, arg6%, arg7%)
    A46D6XDD0($00)
    TX84DF6X6B6\Field5 = $01
    TX84DF6X6B6\Field9 = arg0
    TX84DF6X6B6\Field14 = replace(arg1, "\n", chr($0A))
    TX84DF6X6B6\Field2 = arg2
    TX84DF6X6B6\Field1 = arg3
    TX84DF6X6B6\Field11 = arg4
    TX84DF6X6B6\Field18 = arg6
    TX84DF6X6B6\Field15 = arg5
    TX84DF6X6B6\Field13 = $00
    TX84DF6X6B6\Field6 = $FFFFFFFF
    TX84DF6X6B6\Field0 = $00
    TX84DF6X6B6\Field4 = $00
    If (arg7 > $00) Then
        TX84DF6X6B6\Field13 = (millisecs() + arg7)
    EndIf
    If (arg4 = $02) Then
        selectedinputbox = $3E8
    EndIf
    resetinput(0.0)
    shoulddeletegadgets = $01
    Return $00
End Function
