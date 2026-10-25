Function GUESSEDfreeupdatescreens%()
    If (selectedscreen <> Null) Then
        freeimage(selectedscreen\Field3)
        selectedscreen\Field3 = $00
        selectedscreen = Null
    EndIf
    TDD0Z6BXB6\Field3 = $00
    Return $00
End Function
