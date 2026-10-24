Function rendermessages%()
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    If (T208Z6XX884 <> 0) Then
        Return $00
    EndIf
    If (0.0 < msg\Field2) Then
        If ((invopen Lor (otheropen <> Null)) = $00) Then
            local0 = (((i_294\Field4 Lor (d_i\Field3 <> Null)) Lor (selectedscreen <> Null)) Lor ((selecteditem <> Null) And (((((((selecteditem\Field6\Field9 = $00) Lor (selecteditem\Field6\Field9 = $1E)) Lor (selecteditem\Field6\Field9 = $1F)) Lor (selecteditem\Field6\Field9 = $01)) Lor (selecteditem\Field6\Field9 = $4D)) Lor (selecteditem\Field6\Field9 = $4E)) Lor (selecteditem\Field6\Field9 = $4F))))
        EndIf
        local1 = (Int min((msg\Field2 / 2.0), 255.0))
        setfontex(XD00026ZX2\Field0[$00])
        color($FF, $FF, $FF, local1)
        local2 = (Int ((Float TDD0Z6BXB6\Field9) + (200.0 * menuscale)))
        If (local0 <> 0) Then
            local2 = (Int ((Float opt\Field46) * 0.94))
        EndIf
        textex((Int (((Float ((-200.0 > XZ0260X8X2\Field42) * rand($FFFFFFF6, $0A))) * menuscale) + (Float TDD0Z6BXB6\Field6))), (Int (((Float ((-200.0 > XZ0260X8X2\Field42) * rand($FFFFFFF6, $0A))) * menuscale) + (Float local2))), msg\Field0, $01, $00)
    EndIf
    color($FF, $FF, $FF, $FF)
    If (opt\Field49 <> 0) Then
        local3 = (Int (15.0 * menuscale))
        setfontex(XD00026ZX2\Field0[$0C])
        textex(local3, local3, ("FPS: " + (Str fps\Field1)), $00, $00)
        setfontex(XD00026ZX2\Field0[$00])
    EndIf
    Return $00
End Function
