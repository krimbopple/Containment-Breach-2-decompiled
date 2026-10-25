Function GUESSEDupdategame_4%()
    Local local0.rooms
    T8DB24D8FZ = (T8DB24D8FZ - fps\Field3[$00])
    If (0.0 >= T8DB24D8FZ) Then
        For local0 = Each rooms
            GUESSEDdeleteentity_8(local0)
            GUESSEDdeleteentity_6(local0)
        Next
        T8DB24D8FZ = 35.0
    EndIf
    Return $00
End Function
