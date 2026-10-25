Function updateautosave%()
    If ((((((((opt\Field35 = $00) Lor (selecteddifficulty\Field1 <> $00)) Lor (Int XZ0260X8X2\Field48)) Lor (cansave < $03)) Lor (XZ0260X8X2\Field38 < $02)) Lor XZ0260X8X2\Field23) Lor (GUESSEDupdatexdb() <> $00)) <> 0) Then
        If (350.0 >= autosave\Field0) Then
            cancelautosave()
        EndIf
        Return $00
    EndIf
    If (0.0 >= autosave\Field0) Then
        autosave\Field1 = (autosave\Field1 + $01)
        If (autosave\Field1 >= $05) Then
            autosave\Field1 = $00
        EndIf
        savegame(((currsave\Field2 + "_") + (Str autosave\Field1)))
    Else
        autosave\Field0 = (autosave\Field0 - fps\Field3[$00])
        If (350.0 >= autosave\Field0) Then
            createhintmsg(format(getlocalstring("save", "autosave.in"), (Str (Int (ceil(autosave\Field0) / 70.0))), "%s"), 6.0, $00)
        EndIf
    EndIf
    Return $00
End Function
