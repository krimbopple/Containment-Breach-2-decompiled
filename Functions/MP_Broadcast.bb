Function MP_Broadcast%()
    Local local0.ED844B0F6
    For local0 = Each ED844B0F6
        If (((local0\Field0 = Null) Lor local0\Field0\Field46\Field46) <> 0) Then
            If (local0\Field0 <> Null) Then
                GUESSEDformatobjecttext(local0\Field0, getlocalstring("broadcast", "left"))
            EndIf
            Delete local0
        Else
            local0\Field0\Field46\Field25 = 0.0
        EndIf
    Next
    Return $00
End Function
