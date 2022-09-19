import React from 'react'
import { gql, useQuery } from '@apollo/client'

const GET_USERS = gql`
    query GetUsers {
        members {
            id,
            name
        }
    }
`;

export const App = () => {
    const { data, loading, error } = useQuery(GET_USERS);

    if(loading) return <p>ローディング中です。</p>
    if(error) return <p>エラーが発生しています。</p>

    return(
        <div style={{margin: '3em' }}>
            <h1>GraphQL</h1>
            {data.members.map((member) => (
                <div key={member.id}>Name: {member.name}</div>
            ))}
        </div>
    )
}