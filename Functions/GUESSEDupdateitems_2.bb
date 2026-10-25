Function GUESSEDupdateitems_2%()
    Local local0%
    local0 = millisecs()
    T408D86286\Field3 = (Int ((Float T408D86286\Field3) + max((Float (local0 - T408D86286\Field0)), 0.0)))
    T408D86286\Field0 = local0
    Return T408D86286\Field3
    Return $00
End Function
