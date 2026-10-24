Function checkroomoverlap%(arg0.rooms, arg1.rooms)
    If ((((arg1\Field36 >= arg0\Field34) Lor (arg1\Field24 >= arg0\Field5)) Lor (arg1\Field23 >= arg0\Field38)) <> 0) Then
        Return $00
    EndIf
    If ((((arg1\Field34 <= arg0\Field36) Lor (arg1\Field5 <= arg0\Field24)) Lor (arg1\Field38 <= arg0\Field23)) <> 0) Then
        Return $00
    EndIf
    Return $01
    Return $00
End Function
