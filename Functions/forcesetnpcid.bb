Function forcesetnpcid%(arg0.npcs, arg1%)
    Local local0.npcs
    arg0\Field56 = arg1
    For local0 = Each npcs
        If (local0 <> arg0) Then
            If (local0\Field56 = arg1) Then
                local0\Field56 = findfreenpcid()
            EndIf
        EndIf
    Next
    Return $00
End Function
