Function updateredlight%(arg0.lights, arg1#, arg2#)
    If (arg2 > ((Float millisec) Mod arg1)) Then
        If (entityhidden(arg0\Field7) <> 0) Then
            showentity(arg0\Field7)
        EndIf
    ElseIf (entityhidden(arg0\Field7) = $00) Then
        hideentity(arg0\Field7)
    EndIf
    Return $00
End Function
