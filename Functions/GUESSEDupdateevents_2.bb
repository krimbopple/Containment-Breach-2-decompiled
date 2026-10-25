Function GUESSEDupdateevents_2%()
    Local local0.T24B4ZF6F6
    Local local1.items
    local0 = Null
    If (selecteditem = Null) Then
        local1 = GUESSEDrenderitems()
        If (local1 <> Null) Then
            local0 = GUESSEDrenderrendergui_4(local1\Field6\Field11)
            If (((local0 <> Null) And local0\Field3\Field9) <> 0) Then
                selecteditem = local1
            Else
                local0 = Null
            EndIf
        EndIf
    EndIf
    Return (local0 <> Null)
    Return $00
End Function
