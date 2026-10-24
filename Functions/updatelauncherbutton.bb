Function updatelauncherbutton%(arg0%, arg1%, arg2%, arg3%, arg4$, arg5%, arg6%, arg7%, arg8%, arg9%, arg10%)
    Local local0%
    local0 = $00
    renderframe(arg0, arg1, arg2, arg3, $00, $00, arg7, $01)
    If (mouseon(arg0, arg1, arg2, arg3) <> 0) Then
        color($1E, $1E, $1E, $FF)
        If (((TDD0Z6BXB6\Field7 And (arg6 = $00)) Lor (TDD0Z6BXB6\Field3 And arg6)) <> 0) Then
            If (arg7 <> 0) Then
                playsound_strict(buttonsfx[$01], $00, $00)
            Else
                local0 = $01
                playsound_strict(buttonsfx[$00], $00, $00)
            EndIf
        EndIf
        rect((arg0 + $03), (arg1 + $03), (arg2 - $06), (arg3 - $06), $01)
    Else
        color($00, $00, $00, $FF)
    EndIf
    If (arg7 <> 0) Then
        If ((((arg8 <> $FF) Lor (arg9 <> $FF)) Lor (arg10 <> $FF)) <> 0) Then
            color(arg8, arg9, arg10, $FF)
        Else
            color($64, $64, $64, $FF)
        EndIf
    Else
        color(arg8, arg9, arg10, $FF)
    EndIf
    setfontex(XD00026ZX2\Field0[arg5])
    textex(((arg2 Sar $01) + arg0), ((arg3 Sar $01) + arg1), arg4, $01, $01)
    Return local0
    Return $00
End Function
