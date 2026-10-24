Function updateescapetimer%()
    Local local0.events
    For local0 = Each events
        If (local0\Field32 = $04) Then
            If (local0\Field19 = playerroom) Then
                Return $00
                Exit
            EndIf
        EndIf
    Next
    escapesecondstimer = (escapesecondstimer - fps\Field3[$00])
    If (0.0 >= escapesecondstimer) Then
        escapetimer = (escapetimer + $01)
        escapesecondstimer = 70.0
    EndIf
    Return $00
End Function
