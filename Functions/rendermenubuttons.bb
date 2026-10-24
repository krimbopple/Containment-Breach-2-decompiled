Function rendermenubuttons%()
    Local local0.menubutton
    For local0 = Each menubutton
        T8BX6B882(local0)
    Next
    For local0 = Each menubutton
        local0\Field6 = $00
    Next
    Return $00
End Function
