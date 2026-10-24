Function turnoffsecuritycam%(arg0.rooms, arg1%)
    Local local0.securitycams
    For local0 = Each securitycams
        If (local0\Field6 = arg0) Then
            If (arg1 <> 0) Then
                If (local0\Field12 <> 0) Then
                    If (local0\Field2 <> $01) Then
                        local0\Field2 = $00
                    EndIf
                    hideentity(local0\Field22)
                    hideentity(local0\Field3)
                    local0\Field12 = $00
                EndIf
            ElseIf (local0\Field12 = $00) Then
                If (local0\Field2 = $00) Then
                    local0\Field2 = $02
                EndIf
                showentity(local0\Field22)
                showentity(local0\Field3)
                local0\Field12 = $01
            EndIf
            Exit
        EndIf
    Next
    Return $00
End Function
