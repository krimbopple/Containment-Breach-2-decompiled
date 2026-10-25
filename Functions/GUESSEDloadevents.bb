Function GUESSEDloadevents%()
    Local local0.events
    For local0 = Each events
        Select local0\Field32
            Case $2F
                local0\Field17 = GUESSEDsetevent($2E)
            Case $2D
                local0\Field17 = GUESSEDsetevent($2C)
            Case $2E
                local0\Field17 = GUESSEDsetevent($2F)
                local0\Field18 = GUESSEDsetevent($4D)
            Case $2C
                local0\Field17 = GUESSEDsetevent($2D)
                local0\Field18 = GUESSEDsetevent($4D)
            Case $4D
                local0\Field17 = GUESSEDsetevent($2E)
                local0\Field18 = GUESSEDsetevent($2C)
        End Select
    Next
    Return $00
End Function
