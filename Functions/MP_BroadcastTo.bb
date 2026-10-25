Function MP_BroadcastTo%()
    Local local0.TX2BF6X0FF4
    For local0 = Each TX2BF6X0FF4
        If (local0\Field13 > $01) Then
            local0\Field46\Field25 = (local0\Field46\Field25 + MP_GetLoadingProgress())
            If (70.0 <= local0\Field46\Field25) Then
                GUESSEDsetfield_17(local0)
            EndIf
            If (1050.0 < local0\Field46\Field25) Then
                GUESSEDformatobjecttext(local0, getlocalstring("broadcast", "to"))
            EndIf
        EndIf
    Next
    Return $00
End Function
