Function GUESSEDsetmpmsg%()
    If (((Int XZ0260X8X2\Field48) And (XZ0260X8X2\Field40 = $FFFFFFFF)) <> 0) Then
        If (((FD020X0BZ\Field4 <> $00) And (0.0 <= max((Float ((FD020X0BZ\Field3 - millisecs()) / $3E8)), 0.0))) <> 0) Then
            setfontex(XD00026ZX2\Field0[$00])
            color($FF, $FF, $FF, $FF)
            If (selecteddifficulty\Field1 = $03) Then
                textex(TDD0Z6BXB6\Field6, (Int ((Float opt\Field46) - (30.0 * menuscale))), format(getlocalstring("mpmsg", "respawn"), "NULL", "%s"), $01, $00)
            Else
                textex(TDD0Z6BXB6\Field6, (Int ((Float opt\Field46) - (30.0 * menuscale))), format(getlocalstring("mpmsg", "respawn"), (Str ((Int max((Float ((FD020X0BZ\Field3 - millisecs()) / $3E8)), 0.0)) + $01)), "%s"), $01, $00)
            EndIf
        EndIf
    EndIf
    Return $00
End Function
